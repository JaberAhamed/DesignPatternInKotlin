package singleton.exampleone

// Conventional way to create singleton

class SingleToneOne private constructor() {

    companion object {
        @Volatile
        private lateinit var instance: SingleToneOne

        fun getInstance(): SingleToneOne {
            synchronized(this) {
                if (!::instance.isInitialized) {
                    instance = SingleToneOne()
                }
                return instance
            }
        }
    }

    fun show(){
        println("This is conventional way singleton")
    }
}