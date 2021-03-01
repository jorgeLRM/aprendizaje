module Recursividad where

maximum' :: (Ord a) => [a] -> a
maximum' [] = error "maximum of empty list"
maximum' [x] = x
maximum' (x:xs)
     | x > maxTail = x
     | otherwise = maxTail
     where maxTail = maximum' xs


maximum2' :: (Ord a) => [a] -> a
maximum2' [] = error "maximum of empty list"
maximum2' [x] = x
maximum2' (x:xs) = max x (maximum2' xs)

replicar' :: (Num i, Ord i) => i -> a -> [a]
replicar' n x
     | n <= 0 = []
     | otherwise = x:replicar' (n-1) x

takke' :: (Num i, Ord i) => i -> [a] -> [a]
takke' n _
     | n <= 0 = []
takke' _ []    = []
takke' n (x:xs) = x:takke' (n-1) xs

reversse' :: [a] -> [a]
reversse' [] = []
reversse' (x:xs) = reversse' xs ++ [x]

zipp' :: [a] -> [b] -> [(a,b)]
zipp' _ [] = []
zipp' [] _ = []
zipp' (x:xs) (y:ys) = (x,y):zipp' xs ys

elemm' :: (Eq a) => a -> [a] -> Bool
elemm' a [] = False
elemm' a (x:xs)
     | a == x = True
     | otherwise = a `elemm'` xs

quicksort :: (Ord a) => [a] -> [a]  
quicksort [] = []  
quicksort (x:xs) =   
    let smallerSorted = quicksort [a | a <- xs, a <= x]  
        biggerSorted = quicksort [a | a <- xs, a > x]  
    in  smallerSorted ++ [x] ++ biggerSorted 
