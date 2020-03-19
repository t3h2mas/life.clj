(ns life.board)

(defn new-board [xlength ylength]
  {:pre [(pos? xlength) (pos? ylength)]}
  (vec (map (fn [_x] (vec (boolean-array xlength false))) (range 0 ylength))))

