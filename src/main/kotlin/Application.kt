import app.SynchronizedClass

fun main(){
    val listOfSynchronizedInstances = List(10){ SynchronizedClass() }
    val oneOfTheInstances = listOfSynchronizedInstances.first()

    oneOfTheInstances.addSomeData("Data")
    listOfSynchronizedInstances.forEach { println(it.getDataFromThisInstance()) }

    oneOfTheInstances.addSomeData(" Synchronized")
    listOfSynchronizedInstances.forEach { println(it.getDataFromThisInstance()) }

    oneOfTheInstances.addSomeData(" for All instances!")
    listOfSynchronizedInstances.forEach { println(it.getDataFromThisInstance()) }
}