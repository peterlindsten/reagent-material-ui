(ns reagent-material-ui.icons.filter-5-sharp
  "Imports @material-ui/icons/Filter5Sharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def filter-5-sharp (create-svg-icon (e "path" #js {"d" "M23 1H5v18h18V1zm-2 16H7V3h14v14zM3 5H1v18h18v-2H3V5zm14 10V9h-4V7h4V5h-6v6h4v2h-4v2h6z"})
                                     "Filter5Sharp"))
