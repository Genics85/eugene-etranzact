- I used Long for the Id instead of Int because a banking system user base can grow to a very huge number thereby chosing Long over int because it can give you a lot of numbers 
- I check whether the account has enough balance balance withdrawal is allowed because, you cant withdraw more than what you have in a bank account
- Also I get the user details from the get method i created in the services in the other functions such as delete,update and delete so that the server exception will be thrown when it is not found
- And for the withdrawal I check to make sure the user initiated the withdrawal himself before transaction is allowed to proceed to avoid theft from third parties
- I also used interfaces for the likes of services and controllers so that different implementations of the code methods can be executed without having to specify another functions with same signature, also it helps in easy dependency injection. 