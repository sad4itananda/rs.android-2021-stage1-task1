package subtask3

class StringParser {
    fun getResult(inputString: String): Array<String> {
        val bracketMap = mapOf('<' to '>', '(' to ')', '[' to ']')
        val resultList = mutableListOf<String>()
        for (i in inputString.indices) {
            if (inputString[i] in bracketMap.keys) {
                var count = 1
                val openBracket = inputString[i]
                for (k in i + 1..inputString.lastIndex) {
                    if (inputString[k] == openBracket) {
                        count++
                    }
                    if (inputString[k] == bracketMap[openBracket]) {
                        count--
                        if (count == 0) {
                            resultList.add(inputString.substring(i + 1, k))
                            break
                        }
                    }

                }

            }

        }
        return resultList.toTypedArray()
    }
}
