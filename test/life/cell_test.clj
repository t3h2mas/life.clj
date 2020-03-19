(ns life.cell-test
  (:require [clojure.test :refer :all]
            [life.cell :refer :all]))

(deftest cell-add-test
  (testing "two cells can be added"
    (is (=
          (cell-add
            (cell 40 1330)
            (cell 2 7))
          (cell 42 1337))))
  (testing "add negative values to subtract"
    (is (=
          (cell-add
            (cell 43 1338)
            (cell -1 -1))))))

(deftest cell-neighbors-test
  (testing "neighbors are computed"
    (is (=
          (cell-neighbors (cell 42 42))
          [
           (cell 41 41) (cell 41 42) (cell 41 43)
           (cell 42 41) (cell 42 43)
           (cell 43 41) (cell 43 42) (cell 43 43)
           ]))))