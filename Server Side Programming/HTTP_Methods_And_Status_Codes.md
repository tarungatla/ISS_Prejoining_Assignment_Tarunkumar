# HTTP Methods and Status Codes

## HTTP Methods

HTTP methods define the action to be performed on a resource.

| Method  | Description                              |
| ------- | ---------------------------------------- |
| GET     | Retrieve data from the server            |
| POST    | Create a new resource                    |
| PUT     | Update or replace an existing resource   |
| PATCH   | Partially update a resource              |
| DELETE  | Remove a resource                        |
| HEAD    | Retrieve headers only (no response body) |
| OPTIONS | Get supported methods for a resource     |



---

# HTTP Status Codes

HTTP status codes indicate the result of a request.

## 1xx – Informational

| Code | Meaning             |
| ---- | ------------------- |
| 100  | Continue            |
| 101  | Switching Protocols |

---

## 2xx – Success

| Code | Meaning    |
| ---- | ---------- |
| 200  | OK         |
| 201  | Created    |
| 202  | Accepted   |
| 204  | No Content |

### Examples

* **200 OK** → Data fetched successfully.
* **201 Created** → New resource created.
* **204 No Content** → Resource deleted successfully.

---

## 3xx – Redirection

| Code | Meaning                    |
| ---- | -------------------------- |
| 301  | Moved Permanently          |
| 302  | Found (Temporary Redirect) |
| 304  | Not Modified               |

---

## 4xx – Client Errors

| Code | Meaning                |
| ---- | ---------------------- |
| 400  | Bad Request            |
| 401  | Unauthorized           |
| 403  | Forbidden              |
| 404  | Not Found              |
| 405  | Method Not Allowed     |
| 409  | Conflict               |
| 415  | Unsupported Media Type |
| 429  | Too Many Requests      |

### Examples

* **400** → Invalid request body.
* **401** → Authentication required.
* **403** → User authenticated but lacks permission.
* **404** → Resource does not exist.

---

## 5xx – Server Errors

| Code | Meaning               |
| ---- | --------------------- |
| 500  | Internal Server Error |
| 501  | Not Implemented       |
| 502  | Bad Gateway           |
| 503  | Service Unavailable   |
| 504  | Gateway Timeout       |

### Examples

* **500** → Unexpected server exception.
* **503** → Server is temporarily down.
* **504** → Upstream service took too long to respond.

---
