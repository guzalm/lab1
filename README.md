problem 9. Given numbers“n” and “k”,write the program that
finds Cn
k
(binomial coefficient) using formulaCn
k=Cn−1
k−1
+Cn−1
k where Cn
0=Cn
n=1. To solve, I initialized variable binomal to use recursive.
 Also, there is a formula to solve it findBinCoeff
(a - 1, n - 1) + findBinCoeff(a - 1, n); At the end I returned.
Then In main I added variable binomal to catt the function.
