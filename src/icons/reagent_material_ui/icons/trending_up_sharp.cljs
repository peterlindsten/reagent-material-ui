(ns reagent-material-ui.icons.trending-up-sharp
  "Imports @material-ui/icons/TrendingUpSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def trending-up-sharp (create-svg-icon (e "path" #js {"d" "M16 6l2.29 2.29-4.88 4.88-4-4L2 16.59 3.41 18l6-6 4 4 6.3-6.29L22 12V6h-6z"})
                                        "TrendingUpSharp"))
