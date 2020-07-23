(ns reagent-material-ui.icons.chevron-left
  "Imports @material-ui/icons/ChevronLeft as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def chevron-left (create-svg-icon (e "path" #js {"d" "M15.41 7.41L14 6l-6 6 6 6 1.41-1.41L10.83 12z"})
                                   "ChevronLeft"))
