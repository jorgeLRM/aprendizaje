module GenList where

asc :: Int -> Int -> [Int]
asc n m
     | m < n = []
     | m == n = [m]
     | m > n = n : asc (n+1) m

summ :: [Int] -> Int
summ [] = 0
summ (x:xs) = x + (summ xs)

