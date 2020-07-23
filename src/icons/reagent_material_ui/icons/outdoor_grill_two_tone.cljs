(ns reagent-material-ui.icons.outdoor-grill-two-tone
  "Imports @material-ui/icons/OutdoorGrillTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def outdoor-grill-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M16.58 10H7.42c.77 1.76 2.54 3 4.58 3s3.81-1.24 4.58-3z", "opacity" ".3"}) (e "path" #js {"d" "M17 22c1.66 0 3-1.34 3-3s-1.34-3-3-3c-1.3 0-2.4.84-2.82 2H9.14l1.99-3.06c.29.04.58.06.87.06s.58-.02.87-.06l1.02 1.57c.42-.53.96-.95 1.6-1.21l-.6-.93C17.31 13.27 19 10.84 19 8H5c0 2.84 1.69 5.27 4.12 6.37l-3.95 6.08c-.3.46-.17 1.08.29 1.38.46.3 1.08.17 1.38-.29l1-1.55h6.34C14.6 21.16 15.7 22 17 22zm0-4c.55 0 1 .45 1 1s-.45 1-1 1-1-.45-1-1 .45-1 1-1zm-9.58-8h9.16c-.77 1.76-2.54 3-4.58 3s-3.81-1.24-4.58-3z"}) (e "circle" #js {"cy" "19", "r" "1", "cx" "17", "opacity" ".3"}) (e "path" #js {"d" "M9.41 7h1c.15-1.15.23-1.64-.89-2.96-.42-.5-.68-.77-.46-2.04h-.99c-.21 1.11.03 2.05.89 2.96.22.24.79.67.45 2.04zM11.89 7h1c.15-1.15.23-1.64-.89-2.96-.42-.5-.68-.78-.46-2.04h-.99c-.21 1.11.03 2.05.89 2.96.23.24.8.67.45 2.04zM14.41 7h1c.15-1.15.23-1.64-.89-2.96-.42-.5-.68-.77-.46-2.04h-.99c-.21 1.11.03 2.05.89 2.96.22.24.79.67.45 2.04z"}))
                                             "OutdoorGrillTwoTone"))
