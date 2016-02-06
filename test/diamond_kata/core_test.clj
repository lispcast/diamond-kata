(ns diamond-kata.core-test
  (:require [clojure.test :refer :all]
            [diamond-kata.core :refer :all]))

(deftest a-test
  (is (= ["A"] (diamond-lines \A))))

(deftest b-test
  (is (= [" A"
          "B B"
          " A"] (diamond-lines \B))))

(deftest c-test
  (is (= ["  A"
          " B B"
          "C   C"
          " B B"
          "  A"]
         (diamond-lines \C))))

(deftest d-test
  (is (= ["   A"
          "  B B"
          " C   C"
          "D     D"
          " C   C"
          "  B B"
          "   A"]
         (diamond-lines \D))))

(deftest str-test
  (is (= "A" (diamond-str \A))))

(deftest top-half-test
  (is (= [] (top-half 0)))
  (is (= [" A"] (top-half 1)))
  (is (= ["  A"
          " B B"] (top-half 2))))

(deftest line-test
  (is (= " A" (line 1 0)))
  (is (= " B B" (line 2 1)))
  (is (= " C   C" (line 3 2))))
