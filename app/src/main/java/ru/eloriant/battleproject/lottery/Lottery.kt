package ru.eloriant.battleproject.lottery

import androidx.annotation.IntRange
import kotlin.random.Random
import kotlin.random.nextInt

private const val MINIMUM_BUDGET_FOR_FIND_5_NUMBER = 100_000L
private const val MINIMUM_BUDGET_FOR_FIND_4_NUMBER = 10_000L

private const val MINIMUM_REWARD_FOR_FIND_5_NUMBER = 10_000L
private const val MINIMUM_REWARD_FOR_FIND_4_NUMBER = 1_000L

data class UserInput(
    val name: String,
    val numbers: List<Int>
)

data class UserResult(
    val name: String,
    @IntRange(from = 0,to = 5)
    val countOfFindElement: Int,
)

data class UserOutput(
    val name: String,
    val moneyToWin: Long,
)

class Lottery {

    fun calculateSpendMoney(users: List<UserInput>): Long {
        val winRes = List(5) { Random.nextInt(0..9) }
        return users
            .calculateUserResult(winRes)
            .onEach {
                println("Имя : ${it.name}\t\t Количество: ${it.countOfFindElement}")
            }
            .calculateUserOutput()
            .convertToSpentMoney()
    }


    private fun List<UserInput>.calculateUserResult(winRes: List<Int>): List<UserResult> {
        return listOf()
    }

    private fun List<UserResult>.calculateUserOutput(): List<UserOutput> {
        return listOf()
    }

    private fun List<UserOutput>.convertToSpentMoney(): Long {
        return 0
    }
}
