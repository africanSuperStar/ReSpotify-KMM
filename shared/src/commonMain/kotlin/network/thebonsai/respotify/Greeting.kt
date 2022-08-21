package network.thebonsai.respotify

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}