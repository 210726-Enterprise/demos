# Verbs 
HTTP request verbs or methods indicate the action that a client hopes to perform. 

Characteristics of requests:
(Basically a request either is or isn't each of these) 
- idempotent
    - "identical request can be made once or several times in a row with the same effect while leaving the server in the same state"- MDN 
- safe
    - doesn't alter server's state
    - read-only
- cacheable
    - Determines if there is a chance the the response to the corresponding method can be cached 
- allowed in html forms
- request has a body 

### GET
- Used to retrieve data 
- NO request body
- safe 
- idempotent 
- cacheable 
- allowed in html forms 

### HEAD
- Essentially the same as GET, but the server's *response* should not include a body. 
- Let's say you are planning to request a large amount of info and you want to test out the response without the risk of wasting bandwidth resources--> HEAD 
- Used to retrieve data 
- NO request body
- safe 
- idempotent 
- cacheable 
- NOT allowed in html forms 
- NO response body 

### POST
- "sends data to the server" 
- will often be used to create or update data
- it is NOT idempotent 
- technically there are ways it can be cacheable, but typically isn't thought of as cacheable 
- NOT safe 
- allowed in html forms
- request has a body 
- response has a body  

### PUT
- updates a target resource such that it replaces the current representations with the one included in the PUT request
- it *is* idempotent 
- Not safe 
- Not cacheable 
- Not allowed in html forms 
- response does NOT have a body 
- request does have a body 
- not supported by html forms 

### DELETE
- used to delete a resource
- might have a request and/or response body 
- Not safe 
- Not cacheable 
- Not allowed in html forms 
- *is* idempotent

### CONNECT
- starts a "tunnel"-- two-way communication with the resource
- No request body 
- Recieves a response body 
- Not safe, idempotent, cacheable, or supported by html forms

### OPTIONS
- Get the options for communication with a particular resource
- safe, idempotent 
- request has no body 
- response has a body
- Not cacheable or available in html forms 

### TRACE
- message loop-back test between client and resource
- useful for debugging 
- no request body or response body 
- not safe, cacheable, or allowed in html forms 
- idempotent 

### PATCH
- similar to update
- changes partial aspects of a resource 
- request and response have a body
- not safe, idempotent, allowed in html forms, or cacheable



## References
- [MDN HTTP request methods](https://developer.mozilla.org/en-US/docs/Web/HTTP/Methods)
