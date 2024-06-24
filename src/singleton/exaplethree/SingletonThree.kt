package singleton.exaplethree

// Constructor Argument Singleton

class SingletonThree private constructor(private val name :String) {

    companion object{
        @Volatile
        private lateinit var instance:SingletonThree

        fun getInstance(name: String):SingletonThree{
            synchronized(this){
                if(!::instance.isInitialized){
                   instance = SingletonThree(name)
                }

                return instance
            }
        }
    }

    fun show(){
        println("This is argument singleton ")
    }


}