(ns reagent-material-ui.icons.call-missed-outgoing-rounded
  "Imports @material-ui/icons/CallMissedOutgoingRounded as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def call-missed-outgoing-rounded (create-svg-icon (e "path" #js {"d" "M3.7 9.11l7.59 7.59c.39.39 1.02.39 1.41 0l6.3-6.3V14c0 .55.45 1 1 1s1-.45 1-1V8c0-.55-.45-1-1-1h-6c-.55 0-1 .45-1 1s.45 1 1 1h3.59L12 14.59 5.11 7.7a.9959.9959 0 00-1.41 0c-.38.39-.38 1.03 0 1.41z"})
                                                   "CallMissedOutgoingRounded"))
