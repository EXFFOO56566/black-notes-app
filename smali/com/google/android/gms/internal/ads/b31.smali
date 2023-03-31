.class final synthetic Lcom/google/android/gms/internal/ads/b31;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/xk1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/z21;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Boolean;

    new-instance v0, Lcom/google/android/gms/internal/ads/w21;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, p1}, Lcom/google/android/gms/internal/ads/w21;-><init>(ZZZ)V

    return-object v0
.end method
