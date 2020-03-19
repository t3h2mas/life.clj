(ns life.board-test
  (:require [clojure.test :refer :all]
            [life.board :refer :all]
            [life.cell :refer :all]))

(deftest new-board-test
  (testing "can instantiate a new board with 2x2 dimensions"
    (is (= (new-board 2 2)
           [[false false]
            [false false]]))))

(deftest board-toggle-cell-test
  (testing "the state of a board cell can be reversed"
    (is (= (board-toggle-cell (new-board 2 2) (cell 1 1))
           [[false false]
            [false true]]))))
