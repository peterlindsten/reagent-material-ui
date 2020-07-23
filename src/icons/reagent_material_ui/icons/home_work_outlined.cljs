(ns reagent-material-ui.icons.home-work-outlined
  "Imports @material-ui/icons/HomeWorkOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def home-work-outlined (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M17 15h2v2h-2zm0-4h2v2h-2zm0-4h2v2h-2zm-3.26 0l1.26.84V7z"}) (e "path" #js {"d" "M10 3v1.51l2 1.33V5h9v14h-4v2h6V3z"}) (e "path" #js {"d" "M8.17 5.7L15 10.25V21H1V10.48L8.17 5.7zM10 19h3v-7.84L8.17 8.09 3 11.38V19h3v-6h4v6z"}))
                                         "HomeWorkOutlined"))
