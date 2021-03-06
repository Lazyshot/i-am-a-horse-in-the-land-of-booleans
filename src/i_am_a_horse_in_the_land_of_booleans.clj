(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0)
	(* -1 x)
	x))

(defn divides? [divisor n]
  (= (mod n divisor) 0))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 3 n)  "fizz"
	(divides? 5 n)  "buzz"
	:else           ""
    ))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [n]
  (cond
    (number? n)                     (* 2 n)
	(empty? n)                      nil
	(or (list? n) (vector? n))      (* 2 (count n))
    :else                           true
    ))

(defn leap-year? [year]
  (cond 
    (divides? 400 year)         true
    (divides? 4 year)           (not (divides? 100 year))
    :else                       false
    ))

; '_______'
