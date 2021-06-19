package subtask2

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {
        var upper = a.toUpperCase()
        var result = ""
        for (i in upper) {
            if (b.contains(i))
                result += i
        }
        return if(result==b){
            "YES"
        } else{
            "NO"
        }
    }
}
