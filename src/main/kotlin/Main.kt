fun main(args: Array<String>) {
    println("Enter line -> ")
    var line = readln()
    println()

    if (line.isEmpty()) {
        print("Error")
        return
    }

    var count = IntArray(256)

    for (i in line) {
        count[i.toInt()]++
    }
        for (i in count.indices) {
            if (count[i] > 0) {
                println("${i.toChar()} - ${count[i]}")
            }
        }
}