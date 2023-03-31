.class final synthetic Lcom/google/android/gms/internal/ads/b60;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/l90;


# instance fields
.field private final a:I

.field private final b:Ljava/lang/String;


# direct methods
.method constructor <init>(ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/ads/b60;->a:I

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/b60;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/b60;->a:I

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/b60;->b:Ljava/lang/String;

    check-cast p1, Lcom/google/android/gms/internal/ads/z50;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/z50;->a(ILjava/lang/String;)V

    return-void
.end method
