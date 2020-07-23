(ns reagent-material-ui.icons.line-weight-sharp
  "Imports @material-ui/icons/LineWeightSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def line-weight-sharp (create-svg-icon (e "path" #js {"d" "M3 17h18v-2H3v2zm0 3h18v-1H3v1zm0-7h18v-3H3v3zm0-9v4h18V4H3z"})
                                        "LineWeightSharp"))
