(ns life.cell)

(defn cell [x y]
  {:x x, :y y})

(defn cell-add [c other]
  (cell
    (+ (c :x) (other :x))
    (+ (c :y) (other :y))))

(defn cell-neighbors [c]
  (map
    (partial cell-add c)
    [
     (cell -1 -1) (cell -1 0) (cell -1 1)
     (cell 0 -1) (cell 0 1)
     (cell 1 -1) (cell 1 0) (cell 1 1)
     ]))
