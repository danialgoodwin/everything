/** Store and retrieve persistant data. */
abstract class Database(name: String) {
    
    abstract fun set(key: String, value: Object)
    abstract fun get(key: String, value: Object)
    
    enum Type() {
        KEY_VALUE, FILE, MOCK
    }
    
    class KeyValueDatabase(name: String) {
        
    }
    
    class FileDatabase(name: String) {
    
    }

    class MockDatabase(name: String) {
    
    }

    companion object {
        fun new(name: String, type: Database.Type)
    }
    
}
