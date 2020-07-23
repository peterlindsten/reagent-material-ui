(ns reagent-material-ui.icons.navigate-next-outlined
  "Imports @material-ui/icons/NavigateNextOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def navigate-next-outlined (create-svg-icon (e "path" #js {"d" "M10.02 6L8.61 7.41 13.19 12l-4.58 4.59L10.02 18l6-6-6-6z"})
                                             "NavigateNextOutlined"))
