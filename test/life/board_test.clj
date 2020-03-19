(ns life.board-test
  (:require [clojure.test :refer :all]
            [life.board :refer :all]))

(deftest new-board-test
  (testing "can instantiate a new board with 2x2 dimensions"
    (is (= (new-board 2 2)
           [[false false]
            [false false]]))))
