(ns reagent-material-ui.icons.insert-chart-two-tone
  "Imports @material-ui/icons/InsertChartTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def insert-chart-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M19 5H5v14h14V5zM9 17H7v-7h2v7zm4 0h-2V7h2v10zm4 0h-2v-4h2v4z", "opacity" ".3"}) (e "path" #js {"d" "M3 5v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2H5c-1.1 0-2 .9-2 2zm2 0h14v14H5V5zm2 5h2v7H7zm4-3h2v10h-2zm4 6h2v4h-2z"}))
                                            "InsertChartTwoTone"))
