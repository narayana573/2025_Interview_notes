# API Testing Interview Questions and Answers (Experienced)

## Top 50 Questions

### 1. What is API Testing?

**Answer:** API Testing is a type of software testing that involves testing application programming interfaces (APIs) directly to determine if they meet expectations for functionality, reliability, performance, and security.

### 2. What are the common tools used for API testing?

**Answer:** Postman, SoapUI, REST Assured, JMeter, Karate, Swagger, and Katalon Studio.

### 3. What is the difference between SOAP and REST?

**Answer:** SOAP is a protocol with strict standards, using XML, while REST is an architectural style using standard HTTP methods and supports multiple data formats like XML, JSON.

### 4. What is the difference between PUT and POST methods?

**Answer:** PUT is idempotent and updates a resource or creates it if it doesn’t exist. POST creates a new resource and is not idempotent.

### 5. What status codes are commonly seen in API testing?

**Answer:** 200 (OK), 201 (Created), 204 (No Content), 400 (Bad Request), 401 (Unauthorized), 403 (Forbidden), 404 (Not Found), 500 (Internal Server Error).

### 6. How do you validate the response of an API?

**Answer:** By checking status codes, response body, headers, and response time.

### 7. What is a RESTful API?

**Answer:** RESTful API follows REST architecture constraints like statelessness, client-server architecture, cacheability, etc.

### 8. How do you handle authentication in API testing?

**Answer:** Using methods like Basic Auth, OAuth, Bearer Tokens, and API Keys.

### 9. What are some common security tests for APIs?

**Answer:** Authentication, authorization, input validation, rate limiting, and data encryption tests.

### 10. What is Swagger?

**Answer:** Swagger is a framework for API documentation that allows interaction with API endpoints through a UI.

### 11. Explain idempotency in APIs.

**Answer:** An idempotent API can be called multiple times with the same result every time (e.g., GET, PUT).

### 12. What is a JSON Web Token (JWT)?

**Answer:** JWT is a compact, URL-safe token used for authentication and information exchange.

### 13. What is the difference between 401 and 403 status codes?

**Answer:** 401 indicates authentication is required or failed; 403 means authentication succeeded but the user is not authorized.

### 14. What is a mock server?

**Answer:** A mock server simulates the behavior of a real API, often used in testing and development.

### 15. What is rate limiting?

**Answer:** Restricting the number of API requests a client can make in a given time period.

### 16. What is API versioning?

**Answer:** Managing changes in APIs by creating versions (e.g., v1, v2) to avoid breaking existing clients.

### 17. What is HATEOAS?

**Answer:** Hypermedia as the Engine of Application State, part of REST, provides information dynamically through hyperlinks.

### 18. What is the use of headers in API requests?

**Answer:** Headers provide metadata like content-type, authorization, caching policies, etc.

### 19. How can you perform load testing on APIs?

**Answer:** Using tools like JMeter, Locust, or Gatling to simulate multiple users and measure performance.

### 20. What is throttling in APIs?

**Answer:** Throttling limits the number of API requests from a user to prevent misuse or server overload.

### 21. How to validate JSON schema in API testing?

**Answer:** Using libraries like JSON Schema Validator to compare actual response against the expected schema.

### 22. What is the role of API Gateway?

**Answer:** API Gateway manages APIs, performs routing, security, rate limiting, and analytics.

### 23. What is a 500 Internal Server Error?

**Answer:** A generic error indicating the server encountered an unexpected condition.

### 24. How do you perform negative testing on APIs?

**Answer:** By sending invalid data, wrong endpoints, unsupported HTTP methods, etc.

### 25. What is a payload in API?

**Answer:** Payload refers to the body of the request/response, typically in JSON or XML.

### 26. What are HTTP verbs?

**Answer:** Common verbs include GET, POST, PUT, DELETE, PATCH, OPTIONS.

### 27. What is the OPTIONS HTTP method?

**Answer:** It describes communication options for the target resource, often used in CORS.

### 28. What is the difference between synchronous and asynchronous APIs?

**Answer:** Synchronous APIs wait for the response; asynchronous APIs handle the response later via callbacks.

### 29. What are query parameters?

**Answer:** Parameters added to the URL after `?` to pass data (e.g., `?id=10`).

### 30. What is the use of Postman in API testing?

**Answer:** Postman is used to send API requests, inspect responses, automate tests, and debug APIs.

### 31. How do you automate API tests?

**Answer:** Using tools like Postman (with Newman), REST Assured, or writing scripts in Python, Java, etc.

### 32. What is the difference between endpoint and URI?

**Answer:** URI is the full path to a resource; an endpoint refers to a specific URL where the API can be accessed.

### 33. How do you handle dynamic data in API testing?

**Answer:** Use variables, data files, or scripting in tools like Postman and frameworks.

### 34. What is OAuth 2.0?

**Answer:** An authorization framework enabling third-party apps to obtain limited access to an HTTP service.

### 35. What is CORS?

**Answer:** Cross-Origin Resource Sharing is a mechanism that allows restricted resources on a web page to be requested from another domain.

### 36. What are the components of an HTTP request?

**Answer:** Request line (method + URL), headers, body (optional).

### 37. What is the difference between functional and non-functional API testing?

**Answer:** Functional tests check correctness; non-functional tests check performance, security, and reliability.

### 38. How do you test secured APIs?

**Answer:** Use authentication headers/tokens, test token expiry, and validate authorization levels.

### 39. What is a test suite in API testing?

**Answer:** A collection of API test cases grouped together for execution.

### 40. How do you ensure data integrity in API responses?

**Answer:** By validating the response structure, values, and consistency across calls.

### 41. What are assertions in API testing?

**Answer:** Conditions or checks applied to validate the correctness of the response (e.g., status code, field values).

### 42. What are path parameters?

**Answer:** Parameters included in the URL path (e.g., `/users/{id}`).

### 43. How do you maintain test data?

**Answer:** Use data files (CSV, JSON), environment variables, or setup scripts.

### 44. What is an integration test in API testing?

**Answer:** Testing how different modules or services interact via APIs.

### 45. How do you debug API issues?

**Answer:** Use logs, tools like Postman, browser dev tools, and inspect request/response headers.

### 46. What is the difference between manual and automated API testing?

**Answer:** Manual testing uses tools interactively, while automated testing runs scripts and validations automatically.

### 47. What are pre-request and test scripts in Postman?

**Answer:** Scripts run before a request (pre-request) and after a response (test) for setup and validation.

### 48. How do you deal with API changes?

**Answer:** Use versioning, regression tests, contract testing, and continuous integration.

### 49. What is contract testing?

**Answer:** Verifies that the API conforms to the agreed-upon specification (contract).

### 50. What challenges do you face in API testing?

**Answer:** Handling dynamic data, security testing, environment setup, maintaining test scripts, and mocking dependencies.

---

> This file is Markdown formatted and ready to be used in GitHub or other Markdown-supported platforms.
