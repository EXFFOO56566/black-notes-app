.class final synthetic Lcom/google/android/gms/internal/ads/v80;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/l90;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/v80;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/v80;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/v80;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/v80;->b:Ljava/lang/String;

    check-cast p1, Lcom/google/android/gms/ads/r/a;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/ads/r/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
