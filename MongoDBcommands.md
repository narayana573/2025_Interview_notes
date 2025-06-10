# MongoDB Common Commands

This document provides a list of frequently used MongoDB commands for database, collection, and document management.

## 1. MongoDB Shell Basics

* **Start MongoDB Shell:**
    ```bash
    mongosh
    ```

* **Show current database:**
    ```javascript
    db
    ```

* **Show all databases:**
    ```javascript
    show dbs
    ```
    or
    ```javascript
    show databases
    ```

* **Switch to a database (creates if not exists):**
    ```javascript
    use <database_name>
    ```
    *Example:* `use mydatabase`

* **Exit MongoDB Shell:**
    ```javascript
    exit
    ```

## 2. Database Management

* **Drop the current database:**
    ```javascript
    db.dropDatabase()
    ```

## 3. Collection Management

* **Show all collections in the current database:**
    ```javascript
    show collections
    ```
    or
    ```javascript
    show tables
    ```

* **Create a new collection (explicitly, often done implicitly on first insert):**
    ```javascript
    db.createCollection("<collection_name>")
    ```
    *Example:* `db.createCollection("users")`

* **Drop a collection:**
    ```javascript
    db.<collection_name>.drop()
    ```
    *Example:* `db.users.drop()`

* **Rename a collection:**
    ```javascript
    db.<old_collection_name>.renameCollection("<new_collection_name>")
    ```
    *Example:* `db.users.renameCollection("customers")`

## 4. Document Management (CRUD Operations)

### Create (Insert)

* **Insert a single document:**
    ```javascript
    db.<collection_name>.insertOne({ <field1>: <value1>, <field2>: <value2>... })
    ```
    *Example:* `db.users.insertOne({ name: "Alice", age: 30 })`

* **Insert multiple documents:**
    ```javascript
    db.<collection_name>.insertMany([
        { <field1>: <value1> },
        { <field2>: <value2> }
    ])
    ```
    *Example:* `db.products.insertMany([{ name: "Laptop", price: 1200 }, { name: "Mouse", price: 25 }])`

### Read (Find)

* **Find all documents in a collection:**
    ```javascript
    db.<collection_name>.find()
    ```
    *Example:* `db.users.find()`

* **Find documents with a query filter:**
    ```javascript
    db.<collection_name>.find({ <field>: <value> })
    ```
    *Example:* `db.users.find({ age: 30 })`

* **Find documents with multiple criteria (AND logic):**
    ```javascript
    db.<collection_name>.find({ <field1>: <value1>, <field2>: <value2> })
    ```
    *Example:* `db.users.find({ age: { $gt: 25 }, city: "New York" })`

* **Find one document matching the query:**
    ```javascript
    db.<collection_name>.findOne({ <field>: <value> })
    ```
    *Example:* `db.users.findOne({ name: "Alice" })`

* **Pretty print the output of `find()`:**
    ```javascript
    db.<collection_name>.find().pretty()
    ```

* **Count documents matching a query:**
    ```javascript
    db.<collection_name>.countDocuments({ <query> })
    ```
    *Example:* `db.users.countDocuments({ age: { $gt: 25 } })`

* **Limit the number of results:**
    ```javascript
    db.<collection_name>.find().limit(<number>)
    ```
    *Example:* `db.users.find().limit(5)`

* **Skip a number of results (for pagination):**
    ```javascript
    db.<collection_name>.find().skip(<number>)
    ```
    *Example:* `db.users.find().skip(10)`

* **Sort results:**
    ```javascript
    db.<collection_name>.find().sort({ <field>: 1 | -1 })
    ```
    *`1` for ascending, `-1` for descending*
    *Example:* `db.users.find().sort({ age: -1
