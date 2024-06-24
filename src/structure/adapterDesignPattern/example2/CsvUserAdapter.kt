package structure.adapterDesignPattern.example2

class CsvUserAdapter(private val csvUser: CsvUser) : JsonUser(name = csvUser.username, emailAddress = csvUser.email)