.class final synthetic Lcom/google/android/gms/internal/ads/y31;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/xk1;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/w31;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/w31;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/y31;->a:Lcom/google/android/gms/internal/ads/w31;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/y31;->a:Lcom/google/android/gms/internal/ads/w31;

    check-cast p1, Landroid/location/Location;

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    iget-object p1, v0, Lcom/google/android/gms/internal/ads/w31;->e:Lcom/google/android/gms/internal/ads/zd1;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zd1;->d:Lcom/google/android/gms/internal/ads/rm2;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/rm2;->l:Landroid/location/Location;

    return-object p1
.end method
