.class public final Lcom/google/android/gms/internal/ads/tg;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/dg;


# instance fields
.field private a:Lcom/google/android/gms/internal/ads/i9;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/i9<",
            "Lorg/json/JSONObject;",
            "Lorg/json/JSONObject;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->p()Lcom/google/android/gms/internal/ads/h9;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/ads/fo;->d()Lcom/google/android/gms/internal/ads/fo;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ads/h9;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/fo;)Lcom/google/android/gms/internal/ads/q9;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/l9;->b:Lcom/google/android/gms/internal/ads/m9;

    const-string v2, "google.afma.request.getAdDictionary"

    invoke-virtual {v0, v2, v1, v1}, Lcom/google/android/gms/internal/ads/q9;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/j9;Lcom/google/android/gms/internal/ads/k9;)Lcom/google/android/gms/internal/ads/i9;

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->p()Lcom/google/android/gms/internal/ads/h9;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/ads/fo;->d()Lcom/google/android/gms/internal/ads/fo;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ads/h9;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/fo;)Lcom/google/android/gms/internal/ads/q9;

    move-result-object p1

    sget-object v0, Lcom/google/android/gms/internal/ads/l9;->b:Lcom/google/android/gms/internal/ads/m9;

    const-string v1, "google.afma.sdkConstants.getSdkConstants"

    invoke-virtual {p1, v1, v0, v0}, Lcom/google/android/gms/internal/ads/q9;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/j9;Lcom/google/android/gms/internal/ads/k9;)Lcom/google/android/gms/internal/ads/i9;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/tg;->a:Lcom/google/android/gms/internal/ads/i9;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/i9;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/ads/i9<",
            "Lorg/json/JSONObject;",
            "Lorg/json/JSONObject;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/tg;->a:Lcom/google/android/gms/internal/ads/i9;

    return-object v0
.end method
