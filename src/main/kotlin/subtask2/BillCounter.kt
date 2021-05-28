package subtask2

class BillCounter {
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val mutableAnna =  bill.toMutableList()
        mutableAnna.remove(bill[k])
        val averageForAnna = mutableAnna.sum() / 2
        if  (b == averageForAnna) return "bon appetit"
        else return (b - averageForAnna ).toString()
    }
}
