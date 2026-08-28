object Hamming {
    fun compute(leftStrand: String, rightStrand: String) = require(leftStrand.length == rightStrand.length).run{(leftStrand zip rightStrand).count{it.first != it.second}}
}