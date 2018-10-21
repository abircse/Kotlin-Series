fun main(args: Array<String>) {

    method1()
    var holder = dataholder()
    holder.servercall();

    holder.call("Coxtunes Software Limited")
    holder.name

    print("outPUT is  ${holder.name}")

}

fun method1 ()
{
    println("Response from method1")

}

///----if you create a class & put all function inside this class so lets do it---///
class dataholder
{



    var name: String = "ABIR"

    fun servercall ()
    {
        println("Response from method1")

    }

    fun call (param: String)
    {
        println(param)

    }
}