package app

class SynchronizedClass {
    private companion object {
        var data: String = ""
    }

    fun addSomeData(someData: String) {
        data += someData
    }

    fun getDataFromThisInstance() = data
}