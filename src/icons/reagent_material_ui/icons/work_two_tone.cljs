(ns reagent-material-ui.icons.work-two-tone
  "Imports @material-ui/icons/WorkTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def work-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M4 8h16v11H4z", "opacity" ".3"}) (e "path" #js {"d" "M20 6h-4V4c0-1.11-.89-2-2-2h-4c-1.11 0-2 .89-2 2v2H4c-1.11 0-1.99.89-1.99 2L2 19c0 1.11.89 2 2 2h16c1.11 0 2-.89 2-2V8c0-1.11-.89-2-2-2zM10 4h4v2h-4V4zm10 15H4V8h16v11z"}))
                                    "WorkTwoTone"))
