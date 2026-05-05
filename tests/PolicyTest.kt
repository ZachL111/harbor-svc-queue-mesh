fun main() {
    val signalcase_1 = Signal(89, 74, 19, 22, 5)
    check(Policy.score(signalcase_1) == 81)
    check(Policy.classify(signalcase_1) == "review")
    val signalcase_2 = Signal(60, 99, 19, 8, 9)
    check(Policy.score(signalcase_2) == 130)
    check(Policy.classify(signalcase_2) == "review")
    val signalcase_3 = Signal(88, 79, 8, 21, 13)
    check(Policy.score(signalcase_3) == 157)
    check(Policy.classify(signalcase_3) == "review")
}
