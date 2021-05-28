package subtask1

class HappyArray {
    fun convertToHappy(sadArray: IntArray): IntArray {
        val muatableSadArray: MutableList<Int> = sadArray.toMutableList()
        if (sadArray.isEmpty() || sadArray.size <= 2) return sadArray
        fun wayToHappy() {
            val end = muatableSadArray.size - 2
            var counter = false
            for (i in 1..end) {
                if (muatableSadArray[i] > muatableSadArray[i - 1] + muatableSadArray[i + 1]) {
                    counter = true
                    muatableSadArray.remove(muatableSadArray[i])
                    break
                }
            }
            if (counter == true) wayToHappy()
            else return
        }
        wayToHappy()
        return muatableSadArray.toIntArray()
    }
}

