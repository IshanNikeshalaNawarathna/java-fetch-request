# Java EE 7 with Fetch API Example

This project demonstrates how to use the Fetch API in conjunction with a Java EE 7 backend. The Fetch API is used on the frontend to make HTTP requests to the server, allowing for dynamic and efficient communication between the client and server.

## Project Overview

- **Backend:** Java EE 7
  - RESTful services using JAX-RS
  - Business logic handled by EJB
  - Persistence with JPA
- **Frontend:** HTML/CSS/JavaScript
  - Uses Fetch API for HTTP requests

## Getting Started

### Prerequisites

- A Java EE 7 compliant application server (e.g., WildFly, GlassFish)
- A modern web browser that supports the Fetch API (e.g., Chrome, Firefox)

### Setup and Deployment

1. **Backend Setup:**
   - Deploy the Java EE 7 application to your server. This application provides RESTful endpoints for the frontend to interact with.

2. **Frontend Setup:**
   - The frontend consists of simple HTML/CSS/JavaScript files. Ensure these files are served correctly, and that they can reach the backend endpoints.

3. **Using Fetch API:**
   - The Fetch API is used to perform HTTP operations (GET, POST, PUT, DELETE, etc.) against the Java EE 7 backend.

   Here is an example of a basic GET request using Fetch:

   ```javascript
   fetch('userServletName', {
       method: 'GET',
       headers: {
           'Content-Type': 'application/json'
       }
   })
   .then(response => response.json())
   .then(data => {
       console.log(data);
   })
   .catch(error => {
       console.error('Error:', error);
   });

Example Use Cases
Fetching Data: The Fetch API can be used to retrieve data from the backend
  ```javascript
fetch('/api/data')
    .then(response => response.json())
    .then(data => {
        console.log(data);
    });
  ```
Sending Data: Sending data to the server is simple with the Fetch API:
  ```javascript
fetch('/api/data', {
    method: 'POST',
    headers: {
        'Content-Type': 'application/json'
    },
    body: JSON.stringify({ key: 'value' })
})
.then(response => response.json())
.then(data => {
    console.log('Success:', data);
})
.catch(error => {
    console.error('Error:', error);
});
```
This `README.md` file is a more general and educational guide, focusing on how to use the Fetch API with a Java EE 7 backend, without reference to any specific application like a bookstore. It includes setup instructions, example code snippets, and links to further learning resources.
