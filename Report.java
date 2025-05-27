import org.testng.*;
import org.testng.xml.XmlSuite;
import java.io.*;
import java.util.*;

public class StyledCustomTestNGReport implements IReporter {

    @Override
    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
        StringBuilder html = new StringBuilder();

        html.append("<html><head><title>Custom TestNG Report</title>");
        html.append("<style>")
            .append("body {font-family: Arial;}")
            .append("table {border-collapse: collapse; width: 100%;}")
            .append("th, td {border: 1px solid #ddd; padding: 8px;}")
            .append("th {background-color: #4CAF50; color: white;}")
            .append(".passed {background-color: #d4edda;}")
            .append(".failed {background-color: #f8d7da;}")
            .append(".skipped {background-color: #fff3cd;}")
            .append("</style></head><body>");
        html.append("<h1>Custom TestNG Execution Report</h1>");

        for (ISuite suite : suites) {
            html.append("<h2>Suite: ").append(suite.getName()).append("</h2>");
            for (ISuiteResult result : suite.getResults().values()) {
                ITestContext context = result.getTestContext();

                html.append("<h3>Test: ").append(context.getName()).append("</h3>");
                html.append("<p><strong>Start:</strong> ").append(context.getStartDate())
                    .append(" | <strong>End:</strong> ").append(context.getEndDate()).append("</p>");

                appendResultTable(html, "Passed Tests", context.getPassedTests(), "passed", outputDirectory);
                appendResultTable(html, "Failed Tests", context.getFailedTests(), "failed", outputDirectory);
                appendResultTable(html, "Skipped Tests", context.getSkippedTests(), "skipped", outputDirectory);
            }
        }

        html.append("</body></html>");

        try (FileWriter writer = new FileWriter(outputDirectory + "/styled-custom-report.html")) {
            writer.write(html.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void appendResultTable(StringBuilder html, String title, IResultMap results, String status, String outputDir) {
        if (results.getAllResults().isEmpty()) return;

        html.append("<h4>").append(title).append("</h4>");
        html.append("<table>")
            .append("<tr><th>Class</th><th>Method</th><th>Status</th><th>Exception</th><th>Screenshot</th><th>Time (ms)</th></tr>");

        for (ITestResult result : results.getAllResults()) {
            String methodName = result.getMethod().getMethodName();
            String className = result.getTestClass().getName();
            long duration = result.getEndMillis() - result.getStartMillis();

            String exceptionMsg = "None";
            if (result.getThrowable() != null) {
                exceptionMsg = result.getThrowable().toString().split("\n")[0];
            }

            // Screenshot path
            String screenshotPath = "screenshots/" + methodName + ".png";
            File screenshot = new File(outputDir + "/" + screenshotPath);
            String screenshotTag = screenshot.exists()
                    ? "<a href='" + screenshotPath + "' target='_blank'><img src='" + screenshotPath + "' width='100'/></a>"
                    : "N/A";

            html.append("<tr class='").append(status).append("'>")
                .append("<td>").append(className).append("</td>")
                .append("<td>").append(methodName).append("</td>")
                .append("<td>").append(status.toUpperCase()).append("</td>")
                .append("<td>").append(exceptionMsg).append("</td>")
                .append("<td>").append(screenshotTag).append("</td>")
                .append("<td>").append(duration).append("</td>")
                .append("</tr>");
        }

        html.append("</table>");
    }
}
