(ns reagent-material-ui.icons.filter-9-two-tone
  "Imports @material-ui/icons/Filter9TwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def filter-9-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M13 7h2v2h-2zM7 17h14V3H7v14zm4-4h4v-2h-2c-1.1 0-2-.89-2-2V7c0-1.11.9-2 2-2h2c1.1 0 2 .89 2 2v6c0 1.11-.9 2-2 2h-4v-2z", "opacity" ".3"}) (e "path" #js {"d" "M21 1H7c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V3c0-1.1-.9-2-2-2zm0 16H7V3h14v14zM3 23h16v-2H3V5H1v16c0 1.1.9 2 2 2zm14-10V7c0-1.11-.9-2-2-2h-2c-1.1 0-2 .89-2 2v2c0 1.11.9 2 2 2h2v2h-4v2h4c1.1 0 2-.89 2-2zm-4-4V7h2v2h-2z"}))
                                        "Filter9TwoTone"))
