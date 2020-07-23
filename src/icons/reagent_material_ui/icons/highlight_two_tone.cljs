(ns reagent-material-ui.icons.highlight-two-tone
  "Imports @material-ui/icons/HighlightTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def highlight-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M11 20h2v-3.83l3-3V11H8v2.17l3 3z", "opacity" ".3"}) (e "path" #js {"d" "M6 14l3 3v5h6v-5l3-3V9H6v5zm2-3h8v2.17l-3 3V20h-2v-3.83l-3-3V11zm3-9h2v3h-2zM4.916 4.464l2.12 2.122L5.62 8 3.5 5.877zM18.372 8l-1.414-1.414 2.12-2.12 1.415 1.413z"}))
                                         "HighlightTwoTone"))
