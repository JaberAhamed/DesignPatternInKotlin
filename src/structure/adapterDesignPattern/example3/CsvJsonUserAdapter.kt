package structure.adapterDesignPattern.example3

import structure.adapterDesignPattern.example2.CsvUser
import structure.adapterDesignPattern.example2.JsonUser

class CsvJsonUserAdapter : TwoWayAdapter<CsvUser, JsonUser> {
    override fun adaptTo(source: CsvUser): JsonUser {
        return JsonUser(source.username, source.email)
    }

    override fun adaptFrom(target: JsonUser): CsvUser {
        return CsvUser(target.name, target.emailAddress)
    }
}