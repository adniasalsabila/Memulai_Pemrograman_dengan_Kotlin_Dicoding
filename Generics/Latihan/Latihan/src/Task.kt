/**
 * Untuk menyelesaikan tugas latihan, Anda tidak diperbolehkan mengubah kode yang sudah ada.
 * Cukup tambahkan kode berdasarkan perintah yang sudah ditentukan.
 *
 */
fun main() {
    val stringResult = getResult("Kotlin")
    val intResult = getResult(100)

    // TODO 2
    println(stringResult)
    println(intResult)
}

// TODO 1
fun <T> getResult(args: T): Int {
    if(args is Int) return args*5
    else if(args is String) return args.length
    return 0
}