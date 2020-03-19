(ns life.board)

(defn new-board [xlength ylength]
  {:pre [(pos? xlength) (pos? ylength)]}
  (vec (map (fn [_x] (vec (boolean-array xlength false))) (range 0 ylength))))

(defn board-cell-at [board cell]
  (get-in board [(:x cell) (:y cell)]))

(def board-cell-alive?
  (complement board-cell-at))

(defn board-toggle-cell [board cell]
  (let [position [(:x cell) (:y cell)]]
    (assoc-in
      board
      position
      (not (board-cell-at board cell)))))

;; I LOVE YOU MOM...
;; How did you get stuff...
