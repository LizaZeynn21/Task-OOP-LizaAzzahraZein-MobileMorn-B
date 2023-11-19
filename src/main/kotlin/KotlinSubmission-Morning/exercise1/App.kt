package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val firstName: String = "Liza"
    val lastName: String = "Zein"
    val age: Int = 21
    val isSingle: Boolean = false

    println("Nama: $firstName $lastName")
    println("Umur: $age tahun")
    println("Status: ${if (isSingle) "Single" else "Not Single"}")


}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("Group ID: $groupId")
    println("Group Members: $groupMember")
    println("Session: $session")

    return "Group details printed successfully."
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val groupMembers = listOf("Liza Azzahra Zein", "Rodhiyana", "Ary Linggar", "Fransiscus Xaverius Andika", "Randi Pratama Putra", "Camellia Qurota A'yun", "Ela Krisnawati", "Ahmad Najmi Thoriq", "Abdullah Izuddin Alhaq", "Muhadzir")
    println("List of Group Members: $groupMembers")

    return groupMembers

    return listOf()
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentors = arrayOf("Peja", "Ilham")
    val countOfGroup = 10

    return mentors.size + countOfGroup
}
fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("10", listOf("Liza Azzahra Zein", "Rodhiyana", "Ary Linggar", "Fransiscus Xaverius Andika", "Randi Pratama Putra", "Camellia Qurota A'yun", "Ela Krisnawati", "Ahmad Najmi Thoriq", "Abdullah Izuddin Alhaq", "Muhadzir"), "Morning Session")
    }

