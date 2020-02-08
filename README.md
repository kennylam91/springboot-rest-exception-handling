# springboot-rest-exception-handling
Examples about springboot rest controller with exception handling
1. User library zalando/problem-spring-web (Branch problem-spring-web )
- References:
  - https://www.baeldung.com/problem-spring-web
  - https://github.com/zalando/problem
  - https://github.com/zalando/problem-spring-web
- Final Result
  - Get the response when exception happens as: 
    {
    "type": "validation-fail",
    "title": "Validation Error",
    "status": 400,
    "detail": "Password must have more than 3 characters"
    }
