(ns diamond-kata.core
  (:require [clojure.string :as str]))

(def capitals (vec "ABCDEFGHIJKLMNOPQRSTUVWXYZ"))

(defn ordinal [c]
  (.indexOf capitals c))

(defn spaces [n]
  (str/join (repeat n " ")))

(defn middle [o]
  (let [c (capitals o)]
   (if (zero? o)
     (str c)
     (str c (spaces (- (* 2 o) 1)) c))))

(defn line [m o]
  (str (spaces (- m o)) (middle o)))

(defn top-half [m]
  (map (partial line m) (range m)))

(defn diamond-lines [c]
  (let [m (ordinal c)
        top (top-half m)]
   (concat top [(middle m)] (reverse top))))

(defn diamond-str [c]
  (str/join "\n" (diamond-lines c)))

(defn diamond [c]
  (println (diamond-str c)))
